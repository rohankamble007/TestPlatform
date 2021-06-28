package RiaInsuretech.acme.exam.MyService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RiaInsuretech.acme.exam.Entities.QuestionModel;
import RiaInsuretech.acme.exam.MyRepositories.*;

@Service
public class AddData {

    @Autowired
    private SubjectRepository Subjects;
    @Autowired
    private MyUserRepository Users;
    @Autowired
    private ExaminerRepository Examiners;
    @Autowired
    private ExamService examService;

    public void addAll() {

        examService.addSubject("Math1");
        examService.addExaminer("examiner1", "pass1");
        examService.addUser("user1", "pass1", "examiner1");

        List<QuestionModel> myList1 = new ArrayList<QuestionModel>();

        QuestionModel q1 = new QuestionModel("What is the value of 10+2", "1 : 10 : 3 : 12", "a", "1");
        myList1.add(q1);
        QuestionModel q2 = new QuestionModel("What is the value of 20+2", "5 : 22 : 3 : 12", "a", "1");
        myList1.add(q2);
        QuestionModel q3 = new QuestionModel("What is the value of 30+2", "1 : 10 : 32 : 12", "a", "1");
        myList1.add(q3);

        QuestionModel q4 = new QuestionModel("What is the value of 40+2", "1 : 42 : 3 : 12", "a", "1");
        myList1.add(q4);

        QuestionModel q5 = new QuestionModel("What is the value of 50+2", "1 : 52 : 3 : 12", "a", "1");
        myList1.add(q5);

        QuestionModel q6 = new QuestionModel("What is the value of 60+2", "1 : 10 : 3 : 12", "a", "1");
        myList1.add(q6);

        QuestionModel q7 = new QuestionModel("What is the value of 70+2", "1 : 10 : 72 : 12", "a", "1");
        myList1.add(q7);

        QuestionModel q8 = new QuestionModel("What is the value of 80+2", "1 : 10 : 3 : 82", "a", "1");
        myList1.add(q8);

        QuestionModel q9 = new QuestionModel("What is the value of 90+2", "1 : 10 : 3 : 92", "a", "1");
        myList1.add(q9);

        QuestionModel q10 = new QuestionModel("What is the value of 75+2", "1 : 72 : 3 : 12", "a", "1");
        myList1.add(q10);

        List<QuestionModel> myList2 = new ArrayList<QuestionModel>();

        QuestionModel L2q1 = new QuestionModel("What is the value of 100+10+2", "1 : 10 : 3 : 112", "a", "2");
        myList2.add(L2q1);
        QuestionModel L2q2 = new QuestionModel("What is the value of 100+20+2", "5 : 122 : 3 : 12", "a", "2");
        myList2.add(L2q2);
        QuestionModel L2q3 = new QuestionModel("What is the value of 100+30+2", "1 : 10 : 132 : 12", "a", "2");
        myList2.add(L2q3);

        QuestionModel L2q4 = new QuestionModel("What is the value of 100+40+2", "1 : 142 : 3 : 12", "a", "2");
        myList2.add(L2q4);

        QuestionModel L2q5 = new QuestionModel("What is the value of 100+50+2", "1 : 152 : 3 : 12", "a", "2");
        myList2.add(L2q5);

        QuestionModel L2q6 = new QuestionModel("What is the value of 100+60+2", "1 : 10 : 3 : 112", "a", "2");
        myList2.add(L2q6);

        QuestionModel L2q7 = new QuestionModel("What is the value of 100+70+2", "1 : 10 : 172 : 12", "a", "2");
        myList2.add(L2q7);

        QuestionModel L2q8 = new QuestionModel("What is the value of 100+80+2", "1 : 10 : 3 : 182", "a", "2");
        myList2.add(L2q8);

        QuestionModel L2q9 = new QuestionModel("What is the value of 100+90+2", "1 : 10 : 3 : 192", "a", "2");
        myList2.add(L2q9);

        QuestionModel L2q10 = new QuestionModel("What is the value of 100+75+2", "1 : 172 : 3 : 12", "a", "2");
        myList2.add(L2q10);

        List<QuestionModel> myList3 = new ArrayList<QuestionModel>();

        QuestionModel L3q1 = new QuestionModel("What is the value of 100+10+2", "1 : 10 : 3 : 1112", "a", "3");
        myList3.add(L3q1);
        QuestionModel L3q2 = new QuestionModel("What is the value of  1000+100+20+2", "5 : 1122 : 3 : 12", "a", "3");
        myList3.add(L3q2);
        QuestionModel L3q3 = new QuestionModel("What is the value of  1000+100+30+2", "1 : 10 : 1132 : 12", "a", "3");
        myList3.add(L3q3);

        QuestionModel L3q4 = new QuestionModel("What is the value of  1000+100+40+2", "1 : 1142 : 3 : 12", "a", "3");
        myList3.add(L3q4);

        QuestionModel L3q5 = new QuestionModel("What is the value of  1000+100+50+2", "1 : 1152 : 3 : 12", "a", "3");
        myList3.add(L3q5);

        QuestionModel L3q6 = new QuestionModel("What is the value of  1000+100+60+2", "1 : 10 : 3 : 1112", "a", "3");
        myList3.add(L3q6);

        QuestionModel L3q7 = new QuestionModel("What is the value of  1000+100+70+2", "1 : 10 : 1172 : 12", "a", "3");
        myList3.add(L3q7);

        QuestionModel L3q8 = new QuestionModel("What is the value of  1000+100+80+2", "1 : 10 : 3 : 1182", "a", "3");
        myList3.add(L3q8);

        QuestionModel L3q9 = new QuestionModel("What is the value of  1000+100+90+2", "1 : 10 : 3 : 1192", "a", "3");
        myList3.add(L3q9);

        QuestionModel L3q10 = new QuestionModel("What is the value of 1000+ 100+75+2", "1 : 1172 : 3 : 12", "a", "3");
        myList3.add(L3q10);

        examService.addLevel(myList1, 1, "Math1");
        examService.addLevel(myList2, 2, "Math1");
        examService.addLevel(myList3, 3, "Math1");

    }

}
