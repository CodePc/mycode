package com.code.javaCollection.ListAndQueueCollections;

/**
 * Created by prem on 4/30/2017.
 */
public class OverrideEqualsMethod {
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    String regNo;

    public OverrideEqualsMethod(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof OverrideEqualsMethod) {
            if (regNo != null && this.regNo.equals(((OverrideEqualsMethod) obj).regNo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.regNo.hashCode();
    }
}
