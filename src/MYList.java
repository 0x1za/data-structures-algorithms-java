public class MYList {

    int counter = 0;

    String[] data,dataCopy;


    public MYList(){

        data = new String[1];
    }

    public String get(int i){
        return data[i];
    }

    public void add(String s){

        if (counter == data.length -1){
            //create new array
            dataCopy = new String[data.length+1];
            copyData();
            data[counter] = s;
            counter++;
        }

        else {

            data[counter] = s;
            counter++;
        }
    }

    private void copyData() {

        for (int i = 0; i < data.length;i++){
            dataCopy[i] = data[i];
        }

        data = dataCopy;
    }


    public static void main(String[] args) {
        MYList list = new MYList();
        list.add("Patrick");
        list.add("Nadia");
        list.add("Eche");
        list.add("Perez");
        list.add("Demi");
        System.out.println(list.get(4));
    }


}
