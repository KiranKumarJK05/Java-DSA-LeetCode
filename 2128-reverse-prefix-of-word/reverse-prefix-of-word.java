
class Solution {
    public String reversePrefix(String word, char ch) {

            char[] arr = word.toCharArray();

                    int left = 0;
                            int right = -1;

                                    // Find the first occurrence of ch
                                            for (int i = 0; i < arr.length; i++) {
                                                        if (arr[i] == ch) {
                                                                        right = i;
                                                                                        break;
                                                                                                    }
                                                                                                            }

                                                                                                                    // Reverse the prefix
                                                                                                                            while (left < right) {

                                                                                                                                        char temp = arr[left];
                                                                                                                                                    arr[left] = arr[right];
                                                                                                                                                                arr[right] = temp;

                                                                                                                                                                            left++;
                                                                                                                                                                                        right--;
                                                                                                                                                                                                }

                                                                                                                                                                                                        return new String(arr);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            