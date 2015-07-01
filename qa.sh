for i in {1..1}
do
{
echo 'Test='$i
mvn clean test -Denv.PBURL=http://toolbox.qa.cengage.info/
}
done;

