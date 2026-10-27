class MedianFinder {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

        
    }
    
    public void addNum(int num) {
        if(maxheap.size()==0) maxheap.add(num);
        else{
            if(num<maxheap.peek()) maxheap.add(num);
            else minheap.add(num);
        }
        if(minheap.size()==maxheap.size()+2) maxheap.add(minheap.remove());

        if(maxheap.size()==minheap.size()+2) minheap.add(maxheap.remove());
    }
    
    public double findMedian() {
        if(minheap.size() == maxheap.size()+1) return minheap.peek();

        else if(maxheap.size() == minheap.size()+1) return maxheap.peek();

        else{
            return (minheap.peek()+maxheap.peek())/2.0;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna