package tree;

import java.awt.Color;

public class Tree {
    private double heightFt;  // Non-Static member
    private double trunkDiameterInches;  // Non-Static Member
    private TreeType treeType;    // Using  Enum
    protected  static Color TRUNK_COLOR = new Color(102, 51, 0);

    // Constructor
    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;


    }


    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    // Method = Behavior = Function
    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public  void announceTallTree() {    // Non-Static Behavior or Method or Function
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }

    }

    public static void announceTree(){   // Static Behavior or Method or Function

        System.out.println("Look out for that " + Tree.TRUNK_COLOR + " tree");
    }

}