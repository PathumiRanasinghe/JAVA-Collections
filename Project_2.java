import java.util.*;
import java.io.*;

class Project_2{

    // Method to calculate time for operations on Sets
    public static void calculateTimeSets(Set<Integer> set, FileWriter writer) {
        Random rand = new Random();
        // Adding random elements to the set
        for (int i = 0; i < 1000000; i++) {
            int element = rand.nextInt(100000);
            set.add(element);
        }

        // Creating a temporary collection for later use
        Collection<Integer> tempCollection = new ArrayList<Integer>();
        for (Integer num : set) {
            tempCollection.add(num);
        }

        long addTimes = 0;
        long removeTimes = 0;
        long checkTimes = 0;
        long clearTimes = 0;
        int element3 = rand.nextInt(100000);
        // Ensuring element3 is not already in the set
        while (set.contains(element3)) {
            element3 = rand.nextInt(100000);
        }

        // Performing add, contains, and remove operations and measuring time
        for (int i = 0; i < 100; i++) {
            int element = rand.nextInt(100000);
            long startTime = System.nanoTime();
            set.add(element);
            long endTime = System.nanoTime();
            addTimes += endTime - startTime;

            int element2 = rand.nextInt(100000);
            startTime = System.nanoTime();
            set.contains(element2);
            endTime = System.nanoTime();
            checkTimes += endTime - startTime;

            startTime = System.nanoTime();
            set.remove(element3);
            endTime = System.nanoTime();
            removeTimes += endTime - startTime;
        }

        // Clearing the set and adding elements back from the temporary collection
        for (int i = 0; i < 100; i++) {
            long startTime = System.nanoTime();
            set.clear();
            long endTime = System.nanoTime();
            clearTimes += endTime - startTime;

            for (Integer number : tempCollection) {
                set.add(number);
            }
        }

        // Writing results to file
        try {
            System.out.println(addTimes / 100 + "\t" + checkTimes / 100 + "\t " + removeTimes / 100 + " \t"
                    + clearTimes / 100 + "\n");
            writer.write("\t" + addTimes / 100 + "\t\t" + checkTimes / 100 + "\t\t\t" + removeTimes / 100 + "\t\t"
                    + clearTimes / 100 + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to calculate time for operations on Queues
    public static void calculateTimeQueue(Queue<Integer> queue, FileWriter writer) {
            Random rand = new Random();
            // Adding random elements to the queue
            for (int i = 0; i < 1000000; i++) {
                int element = rand.nextInt(100000);
                queue.add(element);
            }
    
            // Creating a temporary collection for later use
            Collection<Integer> tempCollection = new ArrayList<Integer>();
            for (Integer num : queue) {
                tempCollection.add(num);
            }
    
            long addTimes = 0;
            long removeTimes = 0;
            long checkTimes = 0;
            long clearTimes = 0;
    
            int element3 = rand.nextInt(100000);
            // Ensuring element3 is not already in the queue
            while (queue.contains(element3)) {
                element3 = rand.nextInt(100000);
            }
    
            // Performing add, contains, and remove operations and measuring time
            for (int i = 0; i < 100; i++) {
                int element = rand.nextInt(100000);
                long startTime = System.nanoTime();
                queue.add(element);
                long endTime = System.nanoTime();
                addTimes += endTime - startTime;
    
                int element2 = rand.nextInt(100000);
                startTime = System.nanoTime();
                queue.contains(element2);
                endTime = System.nanoTime();
                checkTimes += endTime - startTime;
    
                startTime = System.nanoTime();
                queue.remove(element3);
                endTime = System.nanoTime();
                removeTimes += endTime - startTime;
            }
    
            // Clearing the queue and adding elements back from the temporary collection
            for (int i = 0; i < 100; i++) {
                long startTime = System.nanoTime();
                queue.clear();
                long endTime = System.nanoTime();
                clearTimes += endTime - startTime;
    
                for (Integer number : tempCollection) {
                    queue.add(number);
                }
            }
    
            // Writing results to file
            try {
                System.out.println(addTimes / 100 + "\t" + checkTimes / 100 + "\t " + removeTimes / 100 + " \t"
                        + clearTimes / 100 + "\n");
                writer.write("\t" + addTimes / 100 + "\t\t" + checkTimes / 100 + "\t\t" + removeTimes / 100 + "\t\t"
                        + clearTimes / 100 + "\n");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }

    // Method to calculate time for operations on Lists
    public static void calculateTimeLists(List<Integer> list, FileWriter writer) {
        Random rand = new Random();
        // Adding random elements to the list
        for (int i = 0; i < 1000000; i++) {
            int element = rand.nextInt(100000);
            list.add(element);
        }

        // Creating a temporary list for later use
        List<Integer> tempList = new ArrayList<Integer>();
        for (Integer num : list) {
            tempList.add(num);
        }

        long addTimes = 0;
        long removeTimes = 0;
        long checkTimes = 0;
        long clearTimes = 0;

        int element3 = rand.nextInt(100000);
        // Ensuring element3 is not already in the list
        while (list.contains(element3)) {
            element3 = rand.nextInt(100000);
        }

        // Performing add, contains, and remove operations and measuring time
        for (int i = 0; i < 100; i++) {
            int element = rand.nextInt(100000);
            long startTime = System.nanoTime();
            list.add(element);
            long endTime = System.nanoTime();
            addTimes += endTime - startTime;

            int element2 = rand.nextInt(100000);
            startTime = System.nanoTime();
            list.contains(element2);
            endTime = System.nanoTime();
            checkTimes += endTime - startTime;

            startTime = System.nanoTime();
            list.remove(element3);
            endTime = System.nanoTime();
            removeTimes += endTime - startTime;

        }

        // Clearing the list and adding elements back from the temporary list
        for (int i = 0; i < 100; i++) {
            long startTime = System.nanoTime();
            list.clear();
            long endTime = System.nanoTime();
            clearTimes += endTime - startTime;

            for (Integer number : tempList) {
                list.add(number);
            }
        }

        // Writing results to file
        try {
            System.out.println(addTimes / 100 + "\t" + checkTimes / 100 + "\t " + removeTimes / 100 + " \t"
                    + clearTimes / 100 + "\n");
            writer.write("\t" + addTimes / 100 + "\t\t" + checkTimes / 100 + "\t\t" + removeTimes / 100 + "\t\t"
                    + clearTimes / 100 + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to calculate time for operations on Maps
    public static void calculateTimeMaps(Map<Integer, Integer> map, FileWriter writer) {
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int element1 = rand.nextInt(100000);
            int element2 = rand.nextInt(100000);
            map.put(element1, element2);
        }

        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            map.put(key, value);
        }

        long addTimes = 0;
        long removeTimes = 0;
        long checkTimes = 0;
        long clearTimes = 0;

        for (int i = 0; i < 100; i++) {
            int element1 = rand.nextInt(100000);
            int element2 = rand.nextInt(100000);
            long startTime = System.nanoTime();
            map.put(element1, element2);
            long endTime = System.nanoTime();
            addTimes += endTime - startTime;

            int element3 = rand.nextInt(100000);
            startTime = System.nanoTime();
            map.containsValue(element3);
            endTime = System.nanoTime();
            checkTimes += endTime - startTime;

            int element4 = rand.nextInt(100000);
            while (map.containsKey(element4)) {
                element4 = rand.nextInt(100000);
            }
            startTime = System.nanoTime();
            map.remove(element4);
            endTime = System.nanoTime();
            removeTimes += endTime - startTime;
        }

        for (int i = 0; i < 100; i++) {
            long startTime = System.nanoTime();
            map.clear();
            long endTime = System.nanoTime();
            clearTimes += endTime - startTime;

            for (Integer key : tempMap.keySet()) {
                int value = tempMap.get(key);
                map.put(key, value);
            }
        }

        // Writing results to file
        try {
            System.out.println(addTimes / 100 + "\t" + checkTimes / 100 + "\t " + removeTimes / 100 + " \t"
                    + clearTimes / 100 + "\n");
            writer.write(addTimes / 100 + "\t\t" + checkTimes / 100 + "\t\t" + removeTimes / 100 + "\t\t"
                    + clearTimes / 100 + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String filename = "output.txt"; // Specify the filename
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("             addTimes   checkTimes   removeTimes  clearTimes\n");

            // HashSet
            Set<Integer> hashSet = new HashSet<>();
            writer.write("HashSet\t\t");
            calculateTimeSets(hashSet, writer);
        
            // TreeSet
            Set<Integer> treeSet = new TreeSet<>();
            writer.write("TreeSet\t\t");
            calculateTimeSets(treeSet, writer);

            // LinkedHashSet
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            writer.write("LinkedHashSet");
            calculateTimeSets(linkedHashSet, writer);
        
            // ArrayList
            List<Integer> arrayList = new ArrayList<>();
            writer.write("ArrayList\t");
            calculateTimeLists(arrayList, writer);

            // LinkedList
            List<Integer> linkedList = new LinkedList<>();
            writer.write("LinkedList\t");
            calculateTimeLists(linkedList, writer);
    
            // ArrayDeque
            Deque<Integer> arrayDeque = new ArrayDeque<>();
            writer.write("ArrayDeque\t");
            calculateTimeQueue(arrayDeque, writer);

            // PriorityQueue
            Queue<Integer> prioritryQueue = new PriorityQueue<>();
            writer.write("PriorityQueue");
            calculateTimeQueue(prioritryQueue, writer);
           
            // HashMap
            Map<Integer, Integer> hashMap = new HashMap<>();
            writer.write("HashMap\t\t\t");
            calculateTimeMaps(hashMap, writer);

            // TreeMap
            Map<Integer, Integer> treeMap = new TreeMap<>();
            writer.write("TreeMap\t\t\t");
            calculateTimeMaps(treeMap, writer);

            // LinkedHashMap
            Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
            writer.write("LinkedHashMap\t");
            calculateTimeMaps(linkedHashMap, writer);


            writer.close(); // Close the writer when done

        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

    }
}