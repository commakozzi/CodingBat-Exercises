public String middleTwo(String str) {

  /*
  Given a string of even length, return a string
  made of the middle two chars, so the string "string"
  yields "ri". The string length will be at least 2.

  middleTwo("string") → "ri"
  middleTwo("code") → "od"
  middleTwo("Practice") → "ct"
  */

  String firstHalf = str.substring(0, (str.length() / 2));
  String lastHalf = str.substring((str.length() / 2), str.length());
  String firstMiddle = firstHalf.substring(firstHalf.length() - 1);
  String secondMiddle = lastHalf.substring(0, 1);

  return firstMiddle + secondMiddle;

}
