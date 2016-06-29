class Scultptor extends Artist {

  String name;

  public void Sculptor(String sculptorName){
    name = sculptorName;
  }

  public static void main(String[] args){
    Sculptor mike = new Sculptor("Michael Angelo");
    System.out.println(mike.name + " was only" + mike.lifeTime(1475, 1564));
  }

}
