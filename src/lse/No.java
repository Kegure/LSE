package lse;
public class No {
    private Node First;
    private Node Last;
    private int Qtd;
    public void inserirNoFinal(int value){
        Node Novo = new Node(value);
        if(this.Qtd == 0){
            this.First = Novo;
            this.Last = Novo;
            this.Qtd = 1;
        }else{
            this.Last.SetNext(Novo);
            this.Last = Novo;
            Qtd++;
        }
    }
    public void inserirNoInicio(int value){
        Node Novo = new Node(value);
        if(this.Qtd == 0){
            this.First = Novo;
            this.Last = Novo;
            Qtd = 1;
        }else{
            Novo.SetNext(this.First);
            this.First = Novo;
            this.Qtd++;
        }
    }
    public boolean isEmpty(){
        if(this.First == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void exibirTodos(){
        Node Aux = this.First;
        if(this.isEmpty() == false){
            while(Aux != null){
                System.out.println(Aux.GetInfo());
                Aux = Aux.GetNext();
            }
        }else{
            System.out.println("Lista Vazia");
        }
    }
    public void removerPrimeiro(){
        if(this.isEmpty() == true ){
            System.out.println("Lista Vazia");
        }else if(this.Qtd == 1){
            this.First = null;
            this.Last = null;
            this.Qtd = 0;
        }
        else{
            this.First = this.First.GetNext();
            this.Qtd--;
        }
    }
    public void removerUltimo(){
        if(this.isEmpty()== true){
            System.out.println("Lista Vazia!");
        }else if(this.Qtd == 1){
            this.First = null;
            this.Last  = null;
            Qtd = 0;
        }else{
            while(Aux != null){
                if(Aux)
            }
        }
    }
    
}
