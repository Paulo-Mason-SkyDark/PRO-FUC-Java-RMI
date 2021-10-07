# PRO-FUC-Java-RMI
Considere um desenvolvedor expandindo as funcionalidades de sua solução Java. Nesse
cenário, imagine aplicadas a criação e a modificação de classes a todo o instante, adicione
também um cliente que queira acessar essas funcionalidades, mas não tenha cópia dessas
novas classes (sejam públicas ou privadas) no mesmo instante em que elas são atualizadas pelo
desenvolvedor inicial.
A solução nesse cenário é a utilização do cliente RMI que busca automaticamente as novas
classes do servidor onde é compartilhada a classe e, consequentemente, a solução que ela traz.
A nova classe é carregada na memória e o cliente RMI pode utilizá-la tranquilamente.
Vejamos um exemplo neste projeto para prova de conceito, para a criação simples de um servidor em Java RMI.
