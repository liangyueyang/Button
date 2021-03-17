

abstract class AbstractSource
{
    public void source()
    {

    }
}
abstract class AbstractTransformer
{
    public void transform()
    {

    }
}
class DatabaseSource extends AbstractSource
{
    public void source()
    {
        System.out.println("这是来自数据库的数据");
    }
}
class TextSource extends AbstractSource
{
    public void source()
    {
        System.out.println("这是来自文本文件的数据");
    }
}
class XMLTransformer extends AbstractTransformer
{
    public void transform()
    {
        System.out.println("转换成为XML文件");
    }
}
class XLSTrancformer extends AbstractTransformer
{
    public void transform()
    {
        System.out.println("转换成为XLS文件");
    }
}
class transfer
{
    AbstractSource databasesource = new DatabaseSource();
    AbstractSource textsource = new TextSource();
    AbstractTransformer xmltransformer = new XMLTransformer();
    AbstractTransformer xlstrancformer = new XLSTrancformer();
    public void databasetoxml()
    {
        databasesource.source();
        xmltransformer.transform();
    }
    public void databasetoxls()
    {
        databasesource.source();
        xlstrancformer.transform();
    }
    public void textbasetoxml()
    {
        textsource.source();
        xmltransformer.transform();
    }
    public void textbasetoxls()
    {
        textsource.source();
        xlstrancformer.transform();
    }
}
public class MainClass
{
    public static void main (String args[])
    {
        transfer databasesource = new transfer();
        transfer textsource = new transfer();
        databasesource.databasetoxls();
        System.out.println(".................\n");
        databasesource.databasetoxml();
        System.out.println(".................\n");
        textsource.textbasetoxls();
        System.out.println(".................\n");
        textsource.textbasetoxml();
    }
}
