class pedido{

  id int;
  entregador Entregador;

 private static nextId = 0;

   private static int getNextId() {
      return nextId++;
   }

   private int id = getNextId();

   public int getId() { return id; }}
  
  
  public objeto[] pilha;
  public int posicaoPilha;

  public Pilha(){
    this.posicaoPilha = -1;
    this.Pilha = new Obect[1000];
  }
 public boolem pilhaVazia(){
   if (this.posicaoPilha == -1){
     return true;
   }
   return false;
 }
 public int tamanho() {
   if (this.pilhaVazia()){
     return 0;
   }
   return this.pilha[this.posicaoPilha];
 }

  public object desempilhar(){
   if (pilhaVazia()){
     return null;
   }  
    return this.pilha[this.posicaoPilha--];
  }

  public void empilhar(object valor){
    if  (this.posicaoPilha < this.pilha.length - 1){
      this.pilha[++posicaoPilha] = velor;
    }
  }
 public static void main (String args[]){

   pilha p = new pilha();
   p.empilhar("produto1");
   p.empilhar("produto2");
   p.empilhar("produto3");
   p.empilhar("10");

    while (p.pilhaVazia() == false) {
      System.out.println(p.desempilhar());
      
    }
 }

 
  

}