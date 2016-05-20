public String twoChar(String str, int index) {

  /*
  Given a string and an index, return a string length
  2 starting at the given index. If the index is too
  big or too small to define a string length 2, use
  the first 2 chars. The string length will be at least 2.

  twoChar("java", 0) → "ja"
  twoChar("java", 2) → "va"
  twoChar("java", 3) → "ja"
  */

  String newString = "";
  int endIndex = index + 2;

  if(endIndex > str.length()) {
    newString = str.substring(0, 2);
  } else if(index < 1) {
    newString = str.substring(0, 2);
  } else {
    newString = str.substring(index, endIndex);
  }

  return newString;

}
