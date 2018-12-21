public class VFDriver {
  public static void main(String[] args) {
    // NoNullArrayList

    NoNullArrayList<String> noNulls = new NoNullArrayList<>();
    System.out.println("NoNullArrayList testing!");
    System.out.println();
    noNulls.add("Somebody");
    noNulls.add("once");
    noNulls.add("told");
    noNulls.add("me");
    noNulls.add("the");
    noNulls.add("world");
    noNulls.add("was");
    noNulls.add("gonna");
    noNulls.add("roll");
    noNulls.add("me");
    System.out.print("Testing add function (should print first line of \'All Star\' in a list): ");
    System.out.println(noNulls);
    System.out.println("Attempting to add null, both methods (should error twice)");
    try {
      noNulls.add(null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }
    try {
      noNulls.add(3, null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }
    System.out.println("----------");

    String[] lyrics = {"And", "the", "years", "start", "coming", "and", "they", "don't", "stop", "coming"};
    for(int i = 0; i < 10; i++) {
      noNulls.set(i, lyrics[i]);
    }
    System.out.println("Testing set function (should print "+noNulls+")");
    System.out.println(noNulls);
    System.out.println("Attempting to set null (should error once)");
    try {
      noNulls.set(3, null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }

    System.out.println("----------");
    System.out.println();
    System.out.println("OrderedArrayList testing!");
    System.out.println();


}}
