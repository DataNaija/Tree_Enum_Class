package tree;

public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,12,TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,30,TreeType.MAPLE);
        //System.out.println(myFavoriteOakTree.treeType);

       // myFavoriteOakTree.announceTallTree();

        // myFavoriteMapleTree.announceTallTree();

        // System.out.println(Tree.TRUNK_COLOR);
        // Tree.announceTree();

        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        myFavoriteMapleTree.grow();



    }
}
