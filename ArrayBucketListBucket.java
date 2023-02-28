package Highlight;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	interface Bucket {
	    /**
	     * This method adds item in the end of the bucket
	     */
	    public abstract void addItem(String item);

	    /**
	     * This method returns item from specified index
	     * index starts from 0
	     */
	    public abstract String getItem(int index);

	    /**
	     * This method returns the number of items inside the bucket
	     */
	    public abstract int numberOfItems();
	}

	class ArrayBucket implements Bucket {
	    private String[] innerItems = new String[10];
	    private int numberOfItems = 0;

	    @Override
	    public void addItem(String item) {
	        if (innerItems.length > numberOfItems) {
	            innerItems[numberOfItems++] = item;
	        } else {
	            // innerItems is full increase size and copy content
	            innerItems = Arrays.copyOf(innerItems, innerItems.length * 2);
	        }
	    }

	    @Override
	    public String getItem(int index) {
	        if (index >= numberOfItems) {
	            throw new IllegalArgumentException("Index out of bounds");
	        }
	        return innerItems[index];
	    }

	    @Override
	    public int numberOfItems() {
	        return numberOfItems;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        for (int i = 0; i < numberOfItems; i++) {
	            sb.append(innerItems[i]);
	            // append comma if it is not last item
	            if (i != (numberOfItems - 1)) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]");

	        return sb.toString();
	    }
	}

	// TODO ListBucket should implement Bucket interface
	// Internally it should work with List and all implemented methods should work correctly
	// based on the requirement
	class ListBucket implements Bucket {
	    private List<String> innerList = new ArrayList<>();
	  
	  @Override
	  public void addItem(String item) {
	    innerList.add(item);
	  }
	  
	  @Override
	  public String getItem(int index) {
	    return innerList.get(index);
	  }
	  
	  @Override
	  public int numberOfItems(){
	    return innerList.size();
	  }
	}

	// do not change this code
	public class ArrayBucketListBucket {
	    public static void main(String[] args) {
	        // Once you implement ListBucket, you could comment Bucket b = new ArrayBucket();
	        // and uncomment below statement to test your implementation.
	        Bucket b = new ListBucket();
	        //Bucket b = new ArrayBucket();
	        b.addItem("apple");
	        b.addItem("banana");
	        b.addItem("kiwi");
	        System.out.println(b); // [apple, banana, kiwi]
	        System.out.println(b.numberOfItems()); // 3
	    }
	}
