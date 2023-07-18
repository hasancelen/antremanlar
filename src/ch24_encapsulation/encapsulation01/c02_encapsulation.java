package ch24_encapsulation.encapsulation01;

public class c02_encapsulation {
    /*
//POJO class create ederken yapilacaklar
1 -> field larin yazilmasi ve encapsule edilmesi
2 -> constructorlarin create edilmesi
3 -> toString methodunun vreate edilmesi
4 -> getter ve setter larin create edilmesi
 */
    private  int id;
    private String name;

    public c02_encapsulation() {
    }



    public c02_encapsulation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

  // public void setId(int id) {
  //     this.id = id;
  // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }

    public  int idGetienMethod(){
        return id;
    }

    @Override
    public String toString() {
        return "c02_encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
