import java.util.Scanner;

public class ExamLauncher {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scan.nextLine();
		if ("0201".equals(s)) {
			Ex0201.launch(); //������ �����-������ ������ �� �������� � �������� ������
		} else if ("0202".equals(s)) {
			Ex0202.launch(); //������ ����� N, ����� N �����. ����� �����
		} else if ("0203".equals(s)) {
			Ex0203.launch(); //������� ����� ������� ����� ������� ����� ������. �� �������� �������� �� ����.
		} else if ("0204".equals(s)) {
			Ex0204.launch(); //������ ����� N. ����� ����� push �����, pop ����� ��� max. �� ������ ����� ������, ����� �� �������� ��������
		} else if ("0205".equals(s)) {
			Ex0205.launch(); //������ ����� N, ����� N �����, ����� ����� M. ����� �����
		} else if ("0301".equals(s)) {
			Ex0301.launch(); //������ ����� N, ����� N �����. ����� �����
		} else if ("0302".equals(s)) {
			Ex0302.launch(); //������ ����� �� ������� ����� ������� ������ ����, �� ������� �������� �� �����. ����� ��� �����
		} else if ("0401".equals(s)) {
			Ex0401.launch(); //������ ����� �� ������� ����� ������� ������ ����, �� ������� �������� �� �����. ����� ��� �����
		} else if ("0402".equals(s)) {
			Ex0402.launch(); //������ ����� �� ������� ����� ������� ������ ����, �� ������� �������� �� �����. ����� ��� �����
		} else if ("0501".equals(s)) {
			Ex0501.launch(); //������ ����� ��������. ����� ����� add ����� ���, find �����
		} else if ("0502".equals(s)) {
			Ex0502.launch(); //������ ������ �� ������� ����� ������� ������ ����, �� ������� �������� �� �����. ����� ��� �����
		} else if ("0503".equals(s)) {
			Ex0503.launch();  //������ ������ �� ������� ����� ������� ������ ����, �� ������� �������� �� �����. ����� ��� �����
		} else if ("0601".equals(s)) {
			Ex0601.launch(); //������������ - ���� 3
		} else if ("0602".equals(s)) {
			Ex0602.launch(); //������ ����� �� ������� ����� ������� ������ ����. ����� �����. ������ ���� ���� ���������� �����������
		} else if ("0603".equals(s)) {
			Ex0603.launch(); //������ ����� �� ������� ����� ������� ������ ����. ����� �����
		} else if ("0605".equals(s)) {
			Ex0605.launch();  //���������� ������
		}
	}
}