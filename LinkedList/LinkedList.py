
class ds:
    def __init__(self,data):
        self.value = data
        self.next = None

head = ds(20)
n1 = ds(304)
n2 = ds(40)
n3 = ds(220)
head.next= n1
n1.next = n2
n2.next = n3 

temp =head
while(temp!=None):
    print(temp.value)
    temp = temp.next 

    

