# java-collections
Código desenvolvido durante os curso de Java Collections do Alura

<a href="https://cursos.alura.com.br/course/java-collections">Java Collections: Dominando Listas, Sets e Mapas<a>
  
 <a href="https://cursos.alura.com.br/certificate/ea00b5f7-af32-42d8-be58-54323d9c2e82">(Certificação de Victor)
  
<a href="https://cursos.alura.com.br/course/java-util-lambdas">Java e java.util: Coleções, Wrappers e Lambda expressions<a>
  
<a href="https://cursos.alura.com.br/certificate/f6108291-e63d-4ec9-bb39-8289d8b27fb2">(Certificação de Victor)
# collections
  
  Seguindo o cronograma de estudo do <a href="https://techguide.sh/pt-BR/path/java/">Tech Guide em Java<a>

Foi indicado para estudar os seguintes itens: 
  
 - Uma coleção representa um grupo de objetos, conhecidos como seus elementos. Eles são como recipientes que agrupam vários itens em uma única unidade. Algumas coleções permitem a duplicação de elementos e outras não. Algumas são ordenadas e outras não ordenadas.
 - Aprender os usos e diferenças entre List, Set e Map
 - Aprender os usos e diferenças entre Equals e HashCode
 - Saiba trabalhar com ArrayList, LinkedList ou Vector
 - Classes Wrappers

#O que foi realmente aprendido durante o curso: 
  
![image001](https://github.com/ceerqueira/collections/assets/50030996/e170c7ee-3989-46d5-b1e4-5fbdd7b9d9aa)
![image002](https://github.com/ceerqueira/collections/assets/50030996/26e6db28-a0ad-4e65-99c1-2076fe849620)



  
 #Interfaces
Neste momento vamos apresentar uma breve descrição de cada uma das interfaces da hierarquia:

 - Collection – está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
Set – interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;
 - List – define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;
 - Map – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.

#Implementações

 - ArrayList – é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são. Podemos afirmar que as inserções e exclusões são lineares, o tempo cresce com o aumento do tamanho da estrutura. Esta implementação é preferível quando se deseja acesso mais rápido aos elementos. Por exemplo, se você quiser criar um catálogo com os livros de sua biblioteca pessoal e cada obra inserida receber um número sequencial (que será usado para acesso) a partir de zero;
 - LinkedList – implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó. Ao contrário do           -ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira LinkedList quando a aplicação exigir grande quantidade de inserções e exclusões. Um pequeno sistema para gerenciar suas compras mensais de supermercado pode ser uma boa aplicação, dada a necessidade de constantes inclusões e exclusões de produtos;
 - HashSet – o acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estarão ordenados. Escolha este conjunto quando a solução exigir elementos únicos e a ordem não for importante. Poderíamos usar esta implementação para criar um catálogo pessoal das canções da nossa discografia;
 - TreeSet – os dados são classificados, mas o acesso é mais lento que em um HashSet. Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural, prefira o TreeSet. É recomendado utilizar esta coleção para as mesmas aplicações de HashSet, com a vantagem dos objetos estarem em ordem natural;
 - LinkedHashSet – é derivada de HashSet, mas mantém uma lista duplamente ligada através de seus itens. Seus elementos são iterados na ordem em que foram inseridos. Opcionalmente é possível criar um LinkedHashSet que seja percorrido na ordem em que os elementos foram acessados na última iteração. Poderíamos usar esta implementação para registrar a chegada dos corredores de uma maratona;
 - HashMap – baseada em tabela de espalhamento, permite chaves e valores null. Não existe garantia que os dados ficarão ordenados. Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). Um exemplo de aplicação é o catálogo da biblioteca pessoal, onde a chave poderia ser o ISBN (International Standard Book Number);
 - TreeMap – implementa a interface SortedMap. Há garantia que o mapa estará classificado em ordem ascendente das chaves. Mas existe a opção de especificar uma ordem diferente. Use esta implementação para um mapa ordenado. Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
 - LinkedHashMap – mantém uma lista duplamente ligada através de seus itens. A ordem de iteração é a ordem em que as chaves são inseridas no mapa. Se for necessário um mapa onde os elementos são iterados na ordem em que foram inseridos, use esta implementação. O registro dos corredores de uma maratona, onde a chave seria o número que cada um recebe no ato da inscrição, é um exemplo de aplicação desta coleção.
