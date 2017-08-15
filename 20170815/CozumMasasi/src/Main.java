import java.sql.SQLException;

import Entity.Problems;
import Entity.Remarks;
import Entity.Solutions;
import Entity.Tags;
import Model.ProblemModel;
import Model.RemarkModel;
import Model.SolutionModel;
import Model.TagModel;

public class Main {

	public static void main(String[] args) throws SQLException {

		ProblemModel islem = new ProblemModel();
		Problems p = new Problems();
		Problems p2 = new Problems();
		Problems p3 = new Problems();
		Problems p4 = new Problems();
		Problems p5 = new Problems();
		RemarkModel notal = new RemarkModel();
		Remarks r1 = new Remarks();
		Remarks r2 = new Remarks();
		TagModel tag = new TagModel();
		Tags t1 = new Tags();
		Tags t2 = new Tags();
		Tags t3 = new Tags();

		// SolutionModel coz = new SolutionModel();
		Solutions s1 = new Solutions();
		Solutions s2 = new Solutions();

		p.setProblem("problem");
		p2.setProblem("Update");
		p2.setProbID(2);
		p3.setProbID(4);
		p4.setProbID(21);

		r1.setRemark("yeni not");
		r2.setRemark("Update note");
		r2.setRemarkID(2);

		s1.setSolution("��z�m");
		s2.setSolution("��z�m g�ncel");
		s2.setSolutionID(2);

		t1.setTag("hashtag");
		t2.setTag("tag g�ncel");
		t2.setTagID(3);
		// islem.add(p);										//problem ekle
		// islem.update(p2);									//problem g�ncelle	
		//System.out.println(islem.readbyid(4).getProblem()); 	//Problemin idsine g�re �ek
		// islem.readall(p5);									//T�m Problemler gelsin
		// islem.delete(22);									//Problem sil

		// notal.addremark(r1);			// Remark ekle
		// notal.updateRemark(r2);		// Remark g�ncelle
		// notal.deleteremark(5);		//remark Sil		
		//notal.readbyid(2);			//remark � id ye g�re al
		
		// coz.addsolution(s1);		//Solution ekle
		// coz.updatesolution(s2);	//Solution g�ncelle
		// coz.deletesolution(4);	//Solution Sil
		
		//tag.addTag(t1);		//Tag ekle
		//tag.updateTag(t2);	//Tag g�ncelle
		//tag.deleteTag(4);		//Tag Sil
		System.out.println(tag.readBytagname(t1));// veritaban�nda ka�tane ayn� kay�ttan oldu�unu g�sterir
		
		
	}
}