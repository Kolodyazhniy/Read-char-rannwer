import java.io.*;


public class ReadCharRun {
	
	public static void main(String[] args) {
		/* �������� ����� ����� System.in ���������� ������������ ������
		������ ��� �������� ������� ������ InputStreamReader */
		InputStreamReader is =
		new InputStreamReader(System.in);
		/* ������������ ����������� ������, ����������� �������������
		��������� � ��������� ������ ��� ���������� �������� ������ */
		BufferedReader bis = new BufferedReader(is);
		try {
		System.out.println(
		"������� ���� ��� � ������� <Enter>:");
		/* ������ ������ �� ������; ����� readLine() ������� ���������
		��������� ������ ��� ����� �� ������� � ����� try */
		String name = bis.readLine();
		System.out.println("������, " + name);
		} catch (IOException e) {
		System.err.print("������ ����� " + e);
		}
		}
	
// TODO Push ti github
}
