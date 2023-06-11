// prinsip polymorphism (overload)

class Book {
  private String id;
  private String title;

  public void Id(String id) {
    this.id = id;
  }

  public String Id() {
    return id;
  }

  public void Title(String title) {
    this.title = title;
  }

  public String Title() {
    return title;
  }
}

// Kelas Book menggunakan prinsip encapsulation 
// dengan menggunakan akses modifier private pada atribut-atributnya 
// (misalnya id, dan title). Atribut-atribut tersebut hanya dapat diakses melalui metode-metode yang 
// ditentukan (setter dan getter) sehingga data dalam objek tersebut terlindungi dan tidak dapat diubah langsung.