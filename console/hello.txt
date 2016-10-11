// Jei neveikia javac komanda, raso kad unrecodnized reikia prideti JAVA_HOME/bin direktorija i system Path sistemini kintamaji:
/* einam i Control Panel\All Control Panel Items\System (arba desniu peles mygtuku ant my computer ir properties arba win+pause/break)
   renkames advanced system settings -> Environment Variables (apacioj desnej)
   skilty "System variables" paziurim ar yra variable'as JAVA_HOME
   jei yra patikrinam ar reiksme veda iki musu jdk, jei nera spaudziam "New..." ir vedam:
   "Variable name"  -> JAVA_HOME
   "Variable value" -> <jdk path> (pvz.: C:\Program Files\Java\jdk1.8.0_101)
   Kai turim JAVA_HOME, surandam Path kintamaji prie system variables (jis tikrai bus)
   pazimim ji ir spaudzia "Edit...", reiksmeje patikrinam ar nera kelio iki jdk kelio bin direktorijos, jei nera tuomet:
   nukeliaujam i pacia pabaiga reiksmes, patikrinam kad ji baigtusi kabletaskiu ;
   jei nesibaigia padedam kabletaski ir prirasom %JAVA_HOME%/bin
   pvz.:    ...Skype\Phone;%JAVA_HOME%\bin
*/
public class Hello {
    /**
     * Pagrindine klase
     */
    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}