public boolean endsLy(String str) {

  /*
  Given a string, return true if it ends in "ly".

  endsLy("oddly") → true
  endsLy("y") → false
  endsLy("oddy") → false
  */

  if ((str.length() > 1) && (str.substring((str.length() - 2), str.length()).equals("ly"))) {
    return true;
  } else {
    return false;
  }

}
