import kr.bydelta.koala.twt.SentenceSplitter;
import java.util.List;

public class splitter {
	public static void main(String args[]) {
		// 새 문장분리기를 초기화합니다
		SentenceSplitter sentSplit = new SentenceSplitter();
		// 분리할 문장.
		String paragraph = "페트로나스 트윈타워는 쿠알라룸푸르 어디에서나 보일 정도로 쿠알라룸푸르에서 가장 크고 밝은 건물입니다! 이 트윈타워의 한 건물은 한국이, 다른 한 건물은 일본 건설 회사에서 지었다고 하는데요, 한국 건설 회사가 일본 건설 회사보다 좀 더 늦게 건축을 시작 했음에도 불구하고 더 먼저 완공을 했다고 하네요! 괜시리 뿌듯해지는 마음입니다. 제가 처음 쿠알라룸푸르에 갔을 때 이 타워를 보고 쿠알라룸푸르가 굉장히 멋진 도시일거라는 생각을 했었어요! 자, 그럼 당연히 쿠알라룸푸르의 상징인 페트로나스 트윈 타워를 감상할 수 있는 루프탑 정도는 알고 가야겠죠? 크리스탈처럼 빛나는 트윈타워를 감상할 수 있는 쿠알라의 힙한 루프탑 두 곳과 저녁을 즐길 수 있는 레스토랑 하나를 소개드리려고 합니다!";
		String paragraph2 = "스카이바는 트레이더스 호텔 33층에 위치한 바인데요,바 가운데 풀이 있는 곳입니다! 이 풀은 낮 시간 동안 수영장으로 이용이 가능하고 밤에는 안전상 이용할 수 없습니다!이 곳에 가는 이유 중 하나! 바로 페트로나스 트윈타워를 창 밖으로 볼 수 있다는 점입니다! 다만 가끔 회사에서 단체로 좌석을 빌리는 경우가 있어 서서 칵테일을 마셔야 되는 경우가 있으니 너무 다리가 피곤한 날은 피해주세요!";
		String paragraph3 = "매주 수요일은 스카이바 LADIES NIGHT 입니다. 오후 여섯시 이후 부터 여성분들에 한해서 무제한 칵테일을 즐길 수 있어요!";

		// 문장들로 분리합니다.
		List<String> sentences = sentSplit.jSentences(paragraph3);

		sentences.forEach((temp) -> {
			System.out.print(temp + "\n");
		});

	}
}
