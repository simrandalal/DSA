class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    int highestPoint = currentAltitude;

    for (int i = 0; i < gain.length; i++) {
      int g = gain[i];
      currentAltitude += g;
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
  }
}
