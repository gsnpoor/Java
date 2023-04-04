package num4;

public class test {
    public static void main(String[] args){
        student[] arr = new student[3];
        student stu1 = new student(1, "zhangsan", 23);
        student stu2 = new student(2, "lisi", 24);
        student stu3 = new student(3, "wangwu", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

//        student stu4 = new student(4, "zhaoliu", 26);
//        boolean flag = contains(arr, stu4.getId());
//        if(flag){
//            System.out.println("当前id重复");
//        }
//        else{
//            int count = getCount(arr);
//            if (count == arr.length){
//                student[] newArr = creatNewArr(arr);
//                newArr[count] = stu4;
//                print(newArr);
//            }else {
//                arr[count] = stu4;
//                print(arr);
//            }
//        }
        int index = getIndex(arr, 3);
        if(index != -1) {
            delete(arr, index);
            print(arr);
        }
        else
            System.out.println("删除失败");
        add(arr, 2);
        print(arr);
    }

    public static void add(student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if (stu.getId() == id){
                stu.setAge(stu.getAge() + 1);
                break;
            }
        }
    }
    public static int getIndex(student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void delete(student[] arr, int index){
        arr[index] = null;
    }
    public static void print(student[] arr){
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if(stu != null)
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
        }
    }
    public static student[] creatNewArr(student[] arr){
        student[] newArr = new student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int getCount(student[] arr){
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if(stu == null){
                count = i;
                break;
            }
        }
        return count;
    }
    public static boolean contains(student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id)
                    return true;
            }
        }
        return false;
    }
}