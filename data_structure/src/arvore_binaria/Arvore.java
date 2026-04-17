package arvore_binaria;

public class Arvore <TIPO extends Comparable<TIPO>> {
        private NoArvore<TIPO> raiz;

        public Arvore() {
            this.raiz = null;
        }

        public void adicionar(TIPO valor) {
            NoArvore<TIPO> novoNo = new NoArvore<TIPO>(valor);
            if (raiz == null) {
                raiz = novoNo;
            } else {
                NoArvore<TIPO> atual = raiz;
                while(true){
                    if (novoNo.getValor().compareTo(atual.getValor()) < 0){
                        if (atual.getEsquerda() != null) {
                            atual = atual.getEsquerda();
                        } else {
                            atual.setEsquerda(novoNo);
                            break;
                        }
                    } else { // se for maior ou igual
                        if (atual.getDireita() != null) {
                            atual = atual.getDireita();
                        } else {
                            atual.setDireita(novoNo);
                            break;
                        }
                    }
                }
            }
        }
}
