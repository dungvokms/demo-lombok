package vn.dung;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeLombok {
    private Long id;
    private String firstName;
    private String lastName;
}
