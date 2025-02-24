
class NodeBluePrint{
    int data;
    NodeBluePrint memory;
    NodeBluePrint(int data)
    {this.data=data;
        this.memory=null;

    }
}


class SinglyLinkedListPrac
{
    NodeBluePrint head;
   public void append(int data)
    {
NodeBluePrint newNode =new NodeBluePrint(data);
if (head == null)
{
    head=newNode;
    return;
}
NodeBluePrint last = head;
while(last.memory != null)
{
    last=last.memory;
}
last.memory=newNode;

    }
    //search the element
   public boolean Search(int key)
   {
          NodeBluePrint checkTheKeyElement =head;
          while(checkTheKeyElement != null)
          {
             if(checkTheKeyElement.data == key)
             {
                return true;
                
             }
             
             checkTheKeyElement = checkTheKeyElement.memory;
          }
          return false;
   }
   
   public void PrintList()
   {
          NodeBluePrint checkTheKeyElement =head;
          while(checkTheKeyElement != null)
          {
             System.out.println(checkTheKeyElement.data);
             
             checkTheKeyElement = checkTheKeyElement.memory;
          }
          
   }

   
    public static void main(String[] args) {
        SinglyLinkedListPrac  list = new SinglyLinkedListPrac();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(100);

        if(list.Search(100)) {
System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        list.PrintList();
    }
}




