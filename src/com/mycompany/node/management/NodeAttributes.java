package com.mycompany.node.management;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum NodeAttributes
{
    // add B3 to move the master branch
    // add B2 to move the master branch
    // add B1 to move the master branch
    // add line B5 to move the master
    // add one line to advance the node management branch
    // add one line in here
    NODE_ATTRIBUTES_UNKNOWN(0,"UNKNOWN"),
    NODE_ATTRIBUTES_TYPE(1,"Type"),
    NODE_ATTRIBUTES_SHELF(2,"Shelf"),
    NODE_ATTRIBUTES_CARD(3,"Card"),
    NODE_ATTRIBUTES_PORT(4,"Port");

    // add line B5 to further move the master
    // add line B4 to move the master
    // add line B2 to move the master
    // add line B1 to move the master
    private int index;
    private String name;

    // add line C1 to move the feature-poc
    // add line A2 to move the PTS-200
    // add one line here in NodeAttributes for the NodeManagement repo testing
    NodeAttributes(int index, String name)
    {
        this.index = index;
        this.name = name;
    }

    // add line A3 to move the PTS-200
    // add line B3 to move the master
    // add E to move PTS-199
    // add C to move PTS-199
    // add B to move PTS-199
    // add A move the feature-1
    public int getIndex()
    {
        // add F to move master
        return index;
    }

    // add D to move master
    // add C to move master
    public String getName()
    {
        return name;
    }
}
