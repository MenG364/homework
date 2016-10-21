/**
 * Created by asus on 2016/10/17.
 */
public class Human {
        String name;
        int age;
        private String gender;
        public void setHuman(String name,int age,String gender){
           this.age=age;
            this.name=name;
            this.gender=gender;
        }
        public int getAge(){
            return this.age;
        }
        public String getName() {
            return this.name;
        }
        public void introduce(){
            System.out.println("姓名："+name+"，年龄："+age+"，性别："+gender);
        }
}

