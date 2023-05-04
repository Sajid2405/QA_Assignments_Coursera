import static org.mockito.Mockito.*;

public class MyMockitoTesting {

    public static void main(String[] args){
        MyTestModel model = mock(MyTestModel.class);
        MyTestModel model2 = mock(MyTestModel.class);
        System.out.println("############################### MY PRINT");
        System.out.println(model.getName());
        System.out.println(model.getAge());
        System.out.println(model.getDob());

        System.out.println("############################### MY PRINT 2");
        System.out.println(model2.getName());
        System.out.println(model2.getAge());
        System.out.println(model2.getDob());

//        when(model.getName()).thenReturn(model.getName());

//        verify(model, times(2)).getName();
    }
}
