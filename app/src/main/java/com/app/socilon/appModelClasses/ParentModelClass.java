package com.app.socilon.appModelClasses;

import java.util.ArrayList;
import java.util.List;

public class ParentModelClass {
    String heading;
    String subheading;
    ArrayList<ChildModelClass> childModelClassList;

    public ParentModelClass(String heading, String subheading, ArrayList<ChildModelClass> childModelClassList) {
        this.heading = heading;
        this.subheading = subheading;
        this.childModelClassList = childModelClassList;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getSubheading() {
        return subheading;
    }

    public void setSubheading(String subheading) {
        this.subheading = subheading;
    }

    public ArrayList<ChildModelClass> getChildModelClassList() {
        return childModelClassList;
    }

    public void setChildModelClassList(ArrayList<ChildModelClass> childModelClassList) {
        this.childModelClassList = childModelClassList;
    }
}
