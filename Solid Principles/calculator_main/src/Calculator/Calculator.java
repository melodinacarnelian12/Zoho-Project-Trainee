package Calculator;

interface Operation {
    double execute(double num1, double num2);
   // double execute1(double num1, double num2,double num3);
}
//enum OperationType {
//    SQUARE,
//    CUBE,
//    SQUARE_ROOT,
//    CUBE_ROOT,
//    POWER_OF_2,
//    POWER_OF_3,
//    INVERSE,
//    LOG_BASE_10
//}

class OperationFactory {
    public Operation createOperation(String t) {
        if (t.trim().equalsIgnoreCase("SQUARE"))
                return new SquareOperation();
        else if(t.trim().equalsIgnoreCase("CUBE"))
                return new CubeOperation();
        else if(t.trim().equalsIgnoreCase("SQUARE_ROOT"))
                return new SquareRootOperation();
        else if(t.trim().equalsIgnoreCase("CUBE_ROOT"))
                return new CubeRootOperation();
        else if(t.trim().equalsIgnoreCase("POWER_OF_2"))
                return new PowerOf2Operation();
        else if(t.trim().equalsIgnoreCase("POWER_OF_3"))
                return new PowerOf3Operation();
        else if(t.trim().equalsIgnoreCase("INVERSE"))
                return new InverseOperation();
//            LOG_BASE_10:
//                return new LogOperation();
            else
                throw new IllegalArgumentException("Invalid operation type: " + t);
        }
    }


class SquareOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.pow(num1, 2);
    }
}


class CubeOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.pow(num1, 3);
    }
}


class SquareRootOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.sqrt(num1);
    }
}

class CubeRootOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.cbrt(num1);
    }
}

 class PowerOf2Operation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.pow(2, num1);
    }
}

class PowerOf3Operation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return Math.pow(3, num1);
    }
}

class InverseOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return 1 / num1;
    }
}

//class LogOperation implements Operation {
//    @Override
//    public double execute(double num1, double num2) {return Math.log10(num1);
//    }
//}
public class Calculator {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 2;
        Operation op = new OperationFactory().createOperation("Square_root");
        // Operation op1 = new OperationFactory().createOperation("Cube_root");
        double result = op.execute(num1, num2);
       //   double result1 = op1.execute(num1, num2);
        System.out.println(result);
      //   System.out.println(result1);
    }
}
