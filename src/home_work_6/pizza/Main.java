package home_work_pizza.pizza;

import pizza.api.IStage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        List<MenuRow> menuRows =new ArrayList<>();
        menuRows.add(new MenuRow(new PizzaInfo("Пеперони","С калбаской и сыром",1),10.5));
        menuRows.add(new MenuRow(new PizzaInfo("Маргарита","Только с сыром",1),11.6));
        menuRows.add(new MenuRow(new PizzaInfo("Гавайская","Ананасик",1),12.2));
        menuRows.add(new MenuRow(new PizzaInfo("Пеперони","С колбаской и сыром",2),15.5));
        menuRows.add(new MenuRow(new PizzaInfo("Маргарита","Только с сыром",2),16.6));
        menuRows.add(new MenuRow(new PizzaInfo("Гавайская","Ананасик",2),17.2));
        menuRows.add(new MenuRow(new PizzaInfo("Пеперони","С колбаской и сыром",3),20.5));
        menuRows.add(new MenuRow(new PizzaInfo("Маргарита","Только с сыром",3),21.6));
        menuRows.add(new MenuRow(new PizzaInfo("Гавайская","Ананасик",3),22.2));
        Menu menu = new Menu(menuRows);

        List<IStage> stages = new ArrayList<>();
        stages.add(new Stage("Первый этап", LocalTime.of(0,0,30)));
        stages.add(new Stage("Второй этап", LocalTime.of(0,0,30)));
        stages.add(new Stage("Третий этап", LocalTime.of(0,0,30)));
        stages.add(new Stage("Четвертый этап", LocalTime.of(0,0,30)));
        System.out.println(stages.get(0).getTime());

        List<SelectedItem> selectedItems = new ArrayList<>();
        selectedItems.add(new SelectedItem(menuRows.get(0),2));
        selectedItems.add(new SelectedItem(menuRows.get(3),1));
        selectedItems.add(new SelectedItem(menuRows.get(8),1));
        Order order = new Order(selectedItems);
        Pzz pzz = new Pzz(menu,stages);
        Ticket ticket =pzz.create(order);
        System.out.println(ticket.getCreatAt());
        while (LocalTime.now().isBefore(localTime.plusSeconds(61))){

        }
        List<IStage>stages1 =pzz.check(ticket).getHistory();
        for (IStage stage:stages1){
            LocalTime time = LocalTime.from(ticket.getCreatAt().plusSeconds(stage.getTime().getSecond()));
            System.out.println(stage.getDescription()+"  "+(ticket.getCreatAt().plusSeconds(stage.getTime().getSecond())));
        }


    }
}
