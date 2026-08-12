package oops_1;

public class Item {
    int id;
    String itemName;
    int stockCount;
    public static void main()
    {
        Item it[] = new Item[3];
        it[0] = new Item(21,"ball",210);
        it[1] = new Item(22,"bat",220);
        it[2] = new Item(23,"stumps",230);
        for(int i=0;i<3;i++)
        {
            it[i].display();
        }

        Item temp=it[1];
        temp.stockCount=99;
        for(int j=0;j<3;j++)
        {
            it[j].display();
        }

    }
    Item(int id,String itemName,int stockCount)
    {
        this.id=id;
        this.itemName=itemName;
        this.stockCount=stockCount;
    }
    void display()
    {

        System.out.println(this.id);
        System.out.println(this.itemName);
        System.out.println(this.stockCount);
    }

}
