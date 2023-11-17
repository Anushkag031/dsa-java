ListNode temp=new ListNode(0);
        ListNode dummy=temp;

        while(list1!=null && list2!=null){
            if(list1.val <list2.val)
            {
            dummy.next=list1;
            list1=list1.next;
            }
            else
            {
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        //if elements lefts in the list
        if(list1!=null)
        {
            dummy.next=list1;
            list1=list1.next;
        }
        if(list2!=null)
        {
            dummy.next=list2;
            list2=list2.next;
        }
        return temp.next;
