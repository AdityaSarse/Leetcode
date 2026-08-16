class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> mp.get(a) - mp.get(b));

        for (int key : mp.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = minHeap.poll();
        }

        return arr;
    }
}