public String withouEnd2(String str) {

  /*
  Given a string, return a version without both the
  first and last char of the string. The string may
  be any length, including 0.

  withouEnd2("Hello") → "ell"
  withouEnd2("abc") → "b"
  withouEnd2("ab") → ""
  */

  String newString;

  if(str.length() <= 2) {
    newString = "";
  } else {
    newString = str.substring(1, str.length() - 1);
  }

  return newString;

}
