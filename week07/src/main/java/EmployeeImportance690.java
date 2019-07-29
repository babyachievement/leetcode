import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * date: 2019/7/29 17:44
 */

public class EmployeeImportance690 {
    public int getImportance(List<Employee> employees, int id) {
        if (employees == null || employees.isEmpty()) {
            return 0;
        }
        Map<Integer, Employee> idMap = new HashMap<>();
        for (Employee employee : employees) {
            idMap.put(employee.id, employee);
        }




        int total = 0;
        LinkedList<Integer> ids = new LinkedList<>();
        ids.addLast(id);
        while (!ids.isEmpty()) {
            final Employee employee = idMap.get(ids.removeFirst());
            total += employee.importance;
            final List<Integer> subordinates = employee.subordinates;
            for (Integer subordinate : subordinates) {
                ids.addLast(subordinate);
            }
        }


        return total;
    }



    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int           id;
        // the importance value of this employee
        public int           importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
}
