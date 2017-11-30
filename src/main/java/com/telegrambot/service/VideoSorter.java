package com.telegrambot.service;

import java.util.List;

/**
 * Created by Just Code.
 */
public class VideoSorter {

    private List<Video> result;

    public List<Video> sortByRatings(List<Video> unsorted) {
        if (unsorted == null || unsorted.isEmpty()){
            return unsorted;
        }
        this.result = unsorted;
        quicksort(0, unsorted.size() - 1);

        return result;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = result.get(high / 2).getRatings();

        while (i <= j) {
            while (result.get(i).getRatings() < pivot) {
                i++;
            }

            while (result.get(j).getRatings() > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        Video temp = result.get(i);
        result.set(i, result.get(j));
        result.set(j, temp);
    }
}
