/**
 * Created by jon on 4/12/15.
 */

import java.util.List;
import java.util.ArrayList;

public class Solution {

    private static int startingBlockIndex = 0;
    private static int lastBlockIndex = 4;
    private static int gridEndIndex = 4;

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(4);
        list1.add(2);
        listOfLists.add(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(7);
        list2.add(4);
        list2.add(3);
        list2.add(7);
        listOfLists.add(list2);


        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(1);
        list3.add(1);
        list3.add(6);
        list3.add(8);
        listOfLists.add(list3);


        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(3);
        list4.add(9);
        list4.add(2);
        list4.add(9);
        listOfLists.add(list4);


        List<Integer> list5 = new ArrayList<>();
        list5.add(9);
        list5.add(8);
        list5.add(9);
        list5.add(2);
        list5.add(4);
        listOfLists.add(list5);


        System.out.println(findLargestVerticalProduct(listOfLists));
        System.out.println(findLargestHorizontalProduct(listOfLists));
    }


    private static int findLargestVerticalProduct(List<List<Integer>> integerGrid) {
        int currentLargestVerticalProduct = 0;
        int startingBlockIndex = 0;
        int endingBlockIndex = startingBlockIndex + 3;
        for (List<Integer> integerList : integerGrid) {
            int currentVerticalProduct = findLargestVerticalProductInList(integerList, startingBlockIndex, endingBlockIndex);
            if (currentLargestVerticalProduct < currentVerticalProduct) {
                currentLargestVerticalProduct = currentVerticalProduct;
            }
        }
        return currentLargestVerticalProduct;
    }

    private static int findLargestVerticalProductInList(List<Integer> integerList, int startingBlockIndex, int endingBlockIndex) {
        int currentProduct = 1;
        int largestProductInList = 1;
        while (endingBlockIndex <= gridEndIndex) {
            List<Integer> sublist = integerList.subList(startingBlockIndex, endingBlockIndex + 1);
            for (Integer currentInt : sublist) {
                currentProduct *= currentInt;
            }
            if (largestProductInList < currentProduct) {
                largestProductInList = currentProduct;
            }
            currentProduct = 1;
            startingBlockIndex +=1;
            endingBlockIndex += 1;
        }
        return largestProductInList;
    }


    private static int findLargestHorizontalProduct(List<List<Integer>> integerGrid) {

        int currentRowNumber = 0;
        int currentGreatestHorizontalProduct = 0;
        int startingBlockIndex = 0;
        int endingBlockIndex = startingBlockIndex + 3;

        while (currentRowNumber <= gridEndIndex) {
            while (endingBlockIndex <= gridEndIndex) {
                int currentProduct = 1;
                for (int currentListIndex = startingBlockIndex; currentListIndex <= endingBlockIndex; currentListIndex++) {
                    List<Integer> currentList = integerGrid.get(currentListIndex);
                    currentProduct *= currentList.get(currentRowNumber);
                }

                if (currentGreatestHorizontalProduct < currentProduct) {
                    currentGreatestHorizontalProduct = currentProduct;
                }
                startingBlockIndex += 1;
                endingBlockIndex += 1;
            }
            currentRowNumber += 1;
            startingBlockIndex = 0;
            endingBlockIndex = startingBlockIndex + 3;
        }

        return currentGreatestHorizontalProduct;
    }
}

