class ds:
    def __init__(self,data):
        self.value = data
        self.next = None


head = ds(23)
n1 = ds(33)
n2 = ds(40)
n3 = ds(240)
n4 = ds(30)
n5 = ds(24)
head.next= n1
n1.next = n2
n2.next = n3 
n3.next = n4
n4.next = n5
temp = head
count =0
while(temp!=None):
    # Number of Elements
    count+=1
    print(temp.value,end=" ")
    temp = temp.next

print("\nNumber of Element in Linked List : ",count)

temp = head
count1 =0
while(temp!=None):
    count1+=1
    if(count1==count/2):
        print("The Mid Element in Linked List : ",temp.value)
        break
    temp = temp.next       


