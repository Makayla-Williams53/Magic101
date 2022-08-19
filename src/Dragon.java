public class Dragon
{
    //1) Instance variables
        String element;

    //2) constructors
        public Dragon(String element)
        {
            this.element = element;
        }

    //4) getters
        public String getElement()
        {
            return element;
        }

    //5) setters
        public void setElement(String element)
        {
            this.element = element;
        }

    //3) toString
        @Override
        public String toString()
        {
            return "Dragon{" +
                    "element='" + element + '\'' +
                    '}';
        }
}
