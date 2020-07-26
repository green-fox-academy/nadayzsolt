public class Recursion {
  public static void main(String[] args) {
    recursiveExample(5);
  }

  public static void recursiveExample(int n) {
    if (n >= 0) {
      recursiveExample(n - 1);
    }
    System.out.println("n is: " + n);
// a probléma az, hogy ha ezt a videóban ( https://www.youtube.com/watch?v=ttTH_WX-Cbo )
// "bad tracing"-re hozott, fent megismételt probléma lekövetése után, ha a nyomtatást beemelem
// az if {-en belülre},akkor majdnem ugyanaz történik, mint eredetileg, csak a -1 tűnik el,
// pedig arra számítottam, hogy, ebben az esetben, kiengedi a nyomtatást és megfordul a sorrend ->
// -> de aztán megnéztem a https://www.youtube.com/watch?v=ozmE8G6YKww - videót és megértettem,
// hogy addig egyetlen egy műveletet sem hajt végre, amíg fel nem rakta a rakat(stack magyarul?)
// tetejére a legfelső műveletet, és onnan jön vissza.
// Mivel SysOut-nak az if {-be való beemelése} esetén a nyomtatásra is teljesülnie kell:
// (n >= 0) feltételnek, ezért tulajdonképpen, az utolsó utáni kérdés, az előző megfordítottja:
//  -Miért nyomtatja ki a -1-et?
  }
}
