package org.schoormann.android.gradle.astyle.test;
public class TestFile {
    private String mTest;
    private String[] mTestArray;
    public TestFile() {
        mTest = "Juhu";
        mTestArray = new String[] {"Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu", "Juhu"};
    }
    public String getTest() {
        return mTest;
    }

    public String[] getTestArray() {
        String[] returnValue;

        if(mTest != null && mTest != null && mTest != null && mTest != null && mTest != null &&
                mTest != null && mTest != null && mTest != null && mTest != null) {
            returnValue =  mTestArray;
        } else {
            returnValue = null;
        }

        return returnValue;
    }
}