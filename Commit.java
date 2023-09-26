class parent{
        void show(){
                System.out.println(" this is parent class");
        }

}

class child extends  parent{
        void show(){
                System.out.println(" this is child class");
        }

}

class child2 extends parent{
        void show(){
                System.out.println(" this is child2 class");
        }

}

class game extends  child2{

        void show(){
                System.out.println(" this is game class");
        }


}



class over{
        public static void main(String[] args){
                parent obj1 = new parent();
                child obj2 = new child();
               parent obj3 = new child();
               parent obj4 = new child2();
               child2 obj6 = new game();
                parent obj5 = new game();
               
                obj1.show() ;
                
                obj2.show() ;
                
                obj3.show();
                
                 obj4.show();
                 
                   obj5.show();
                   
                   obj6.show();
        }

}
