public class Main {
  // This is your test input data. To start, use the testData array to make sure
  // your code works. In this list, the two entries that sum to 2020 are 1721 and
  // 299. Multiplying them together produces 1721 * 299 = 514579, so the correct
  // answer is 514579.
  private static int[] testData = new int[] { 1721, 979, 366, 299, 675, 1456 };
  // Then, change your solvePuzzle() function to use this inputData array to get
  // the puzzle result.
  private static int[] inputData = new int[] { 1993, 1715, 1997, 1666, 1676, 1830, 1203, 1800, 1125, 1191, 1902, 1972,
      1471, 1137, 2003, 1250, 1548, 1070, 1152, 2004, 1127, 1111, 1898, 1848, 1934, 1236, 1704, 1950, 1387, 1713, 1214, 1266,
      1114, 1089, 1677, 1207, 1341, 1689, 1772, 1901, 1932, 1645, 1285, 1884, 883, 1291, 1543, 1455, 1213, 1088, 1784,
      1506, 1879, 1811, 1880, 994, 1021, 1585, 1662, 1683, 1071, 1643, 1754, 1389, 1124, 1820, 1168, 1875, 1017, 1180,
      1375, 1359, 1311, 1357, 1501, 1719, 1584, 1609, 1977, 1786, 1232, 1263, 1748, 1664, 1693, 1766, 1598, 1053, 1277,
      1466, 1877, 1844, 1829, 1165, 1606, 1298, 1963, 1873, 1911, 1729, 1418, 1372, 1777, 1371, 1588, 1329, 1029, 1931,
      1115, 1810, 1595, 1237, 1282, 1838, 1642, 1937, 1343, 1578, 1425, 1814, 1690, 1129, 1321, 1174, 1863, 1405, 1066,
      1220, 1780, 1410, 1156, 1991, 1568, 1368, 99, 1750, 1280, 1400, 1601, 1804, 1363, 1613, 1252, 1434, 1094, 1867,
      1542, 1093, 1926, 1251, 1348, 689, 1441, 1913, 1969, 1409, 1201, 1459, 1110, 1452, 1051, 1860, 1346, 1537, 1060,
      1182, 1386, 1141, 1184, 1989, 1852, 1097, 1135, 1078, 1587, 1984, 1970, 1259, 1281, 1092, 1294, 1233, 1186, 1555,
      1755, 1886, 1030, 1706, 1313, 1481, 1998, 1181, 1244, 1269, 1684, 1798, 1023, 1960, 1050, 1293 };

  // Function to calculate the puzzle result. This runs when the page loads.
  public static int solvePuzzle() {
    // These are placeholder variables. Replace them with your results.
    var val1 = 0;
    var val2 = 0;

    // Using the test data above, find the two entries that sum to 2020.
    // Then multiply those two numbers together.
    /** ************TODO: YOUR CODE GOES HERE.***********/
    for(int i = 0; i < testData.length; i++)
    {
      int val3 = val1 + val2;
      if(val3 == 2020){
        System.out.println("Value 1: " + val1);
        System.out.println("Value 2: " + val2);
      }
      else
      {
        System.out.println(i + " this is how many it took to get the result");
      }
    }



    /****************************************************/

    // Print the values and return product
    return val1 * val2;
  }

  public static void main(String[] args) {
    int result = solvePuzzle();
    System.out.println("Puzzle result: " + result);
  }
}