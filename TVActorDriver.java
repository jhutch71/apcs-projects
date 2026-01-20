/*
 * Big Hollywood Star (20 points)
 * Project Description:
 *   Creates several TVActor objects, fills in their fields, and prints
 *   the results. Students will add a third field and update the output.
 */

public class TVActorDriver
{
    public static void main(String[] args)
    {
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.age = 35;

        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.age = 43;

        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.age = 25;

        // TODO: Update these print lines to include your new field in a consistent format
        System.out.println(a.name + ", age " + a.age + ", played " + a.role);
        System.out.println(b.name + ", age " + b.age + ", played " + b.role);
        System.out.println(c.name + ", age " + c.age + ", played " + c.role);
    }
}
