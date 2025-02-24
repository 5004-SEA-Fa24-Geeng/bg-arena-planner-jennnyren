# Board Game Arena Planner Design Document


This document is meant to provide a tool for you to demonstrate the design process. You need to work on this before you code, and after have a finished product. That way you can compare the changes, and changes in design are normal as you work through a project. It is contrary to popular belief, but we are not perfect our first attempt. We need to iterate on our designs to make them better. This document is a tool to help you do that.


## (INITIAL DESIGN): Class Diagram 

Place your class diagrams below. Make sure you check the file in the browser on github.com to make sure it is rendering correctly. If it is not, you will need to fix it. As a reminder, here is a link to tools that can help you create a class diagram: [Class Resources: Class Design Tools](https://github.com/CS5004-khoury-lionelle/Resources?tab=readme-ov-file#uml-design-tools)
*******
<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:135.0) Gecko/20100101 Firefox/135.0" version="26.0.16">
  <diagram name="Page-1" id="YdiRK-ZjT-0MZAv3eODp">
    <mxGraphModel dx="870" dy="1690" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="UV5UOb9wK4g15yfljiYe-49" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=block;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-2">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="190" y="-580" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-2" value="GameList" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="40" y="-530" width="170" height="170" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-4" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-2">
          <mxGeometry y="26" width="170" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-5" value="&lt;div&gt;+getGameName()::List&lt;/div&gt;&lt;div&gt;+clear()::void&lt;/div&gt;&lt;div&gt;+count()::int&lt;/div&gt;&lt;div&gt;+saveGame(filename: String)::void&lt;/div&gt;&lt;div&gt;+addToList(str: String, filtered: Stream)::void&lt;/div&gt;&lt;div&gt;+removeFromList(str: String)::void&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-2">
          <mxGeometry y="34" width="170" height="136" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-10" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Interface&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;IGameList&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ADD_ALL:String=&quot;all&quot;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+getGameNames()&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+clear()&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+count()::int&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+saveGame(filename: String)::void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+addToList(str: String, filtered: Stream)::void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+removeFromList(str: String)::void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="100" y="-760" width="190" height="175" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-11" value="Planner" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="630" y="-540" width="160" height="160" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-13" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-11">
          <mxGeometry y="26" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-14" value="&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+filter(filter:String)::Stream&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+filter(filter: String, sortOn:GameData)::Stream&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+filter(filter:String, sortOn:GameData, ascending: boolean)::Stream&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+reset()::void&lt;/p&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-11">
          <mxGeometry y="34" width="160" height="126" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-15" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Interface&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;IPlanner&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+filter(filter: String, sortOn:GameData)::Stream&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+filter(filter:String, sortOn:GameData, ascending: boolean)::Stream&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+reset()::void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="570" y="-760" width="190" height="140" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-46" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-16" target="UV5UOb9wK4g15yfljiYe-34">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-16" value="ConsoleApp" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="325" y="-760" width="200" height="370" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-17" value="&lt;div&gt;-IN: Scanner&lt;/div&gt;&lt;div&gt;-DEFAULT_FILENAME: String&lt;/div&gt;&lt;div&gt;-RND: Random&lt;/div&gt;&lt;div&gt;-current: Scanner&lt;/div&gt;&lt;div&gt;-gameList: IGameList&lt;/div&gt;&lt;div&gt;-planner: IPlanner&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-16">
          <mxGeometry y="26" width="200" height="104" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-18" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-16">
          <mxGeometry y="130" width="200" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-19" value="&lt;div&gt;+start()::void&lt;/div&gt;&lt;div&gt;-randomNumber()::void&lt;/div&gt;&lt;div&gt;-processHelp()::void&lt;/div&gt;&lt;div&gt;-processFilter()::void&lt;/div&gt;&lt;div&gt;-printFilterStream(games: Stream&amp;lt;BoardGame&amp;gt;, sortOn: GameData)::void&lt;/div&gt;&lt;div&gt;-processListCommands()::void&lt;/div&gt;&lt;div&gt;-printCurrentList()::void&lt;/div&gt;&lt;div&gt;-nextCommand()::ConsoleText&lt;/div&gt;&lt;div&gt;-remainder()::String&lt;/div&gt;&lt;div&gt;-getInput(format: String, args: Object)::String&lt;/div&gt;&lt;div&gt;-printOutput(format: String, output: Object)::void&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-16">
          <mxGeometry y="138" width="200" height="232" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-40" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-20" target="UV5UOb9wK4g15yfljiYe-16">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-20" value="BGArenaPlanner" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="280" y="-890" width="300" height="100" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-21" value="- DEFAULT_COLLECTION: String = &quot;/collection.csv&quot; " style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-20">
          <mxGeometry y="26" width="300" height="26" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-22" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-20">
          <mxGeometry y="52" width="300" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-23" value="&lt;div&gt;- BGArenaPlanner()&lt;/div&gt;&lt;div&gt;+ main(args: String[])::void&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-20">
          <mxGeometry y="60" width="300" height="40" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-24" value="GameLoader" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="30" y="-260" width="160" height="170" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-25" value="-DELIMITER:String=&quot;,&quot;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-24">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-26" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-24">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-27" value="&lt;div&gt;+loadGamesFile(filename: String)::Set&lt;/div&gt;&lt;div&gt;-toBoardGame(line: String, columnMap: Map)::BoardGame&lt;/div&gt;&lt;div&gt;-processHeader(header: String)::Map&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-24">
          <mxGeometry y="60" width="160" height="110" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-28" value="BoardGame" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="230" y="180" width="400" height="460" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-29" value="&lt;div&gt;- name: String&lt;/div&gt;&lt;div&gt;-id: int&lt;/div&gt;&lt;div&gt;-minPlayers: int&lt;/div&gt;&lt;div&gt;-maxPlayers: int&lt;/div&gt;&lt;div&gt;-minPlayTime: int&lt;/div&gt;&lt;div&gt;-maxPlayTime: int&lt;/div&gt;&lt;div&gt;-difficulty: double&lt;/div&gt;&lt;div&gt;-rank: int&lt;/div&gt;&lt;div&gt;-averageRating: double&lt;/div&gt;&lt;div&gt;-yearPublished: int&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-28">
          <mxGeometry y="26" width="400" height="154" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-30" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-28">
          <mxGeometry y="180" width="400" height="8" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-31" value="&lt;div&gt;+BoardGame(name: String, id: int, minPlayers: int, maxPlayers: int,&lt;/div&gt;&lt;div&gt;minPlayTime: int, maxPlayTime: int, difficulty: double, rank: int, averageRating: double, yearPublished: int)&lt;/div&gt;&lt;div&gt;+getName()::String&lt;/div&gt;&lt;div&gt;+getId()::int&lt;/div&gt;&lt;div&gt;+getMinPlayers()::int&lt;/div&gt;&lt;div&gt;+getMaxPlayers()::int&lt;/div&gt;&lt;div&gt;+getMaxPlayTime()::int&lt;/div&gt;&lt;div&gt;+getMinPlayTime()::int&lt;/div&gt;&lt;div&gt;+getDifficulty()::double&lt;/div&gt;&lt;div&gt;+getRank()::int&lt;/div&gt;&lt;div&gt;+getRating()::double&lt;/div&gt;&lt;div&gt;+getYearPublished()::int&lt;/div&gt;&lt;div&gt;+toStringWithInfo(col: GameData)::String&lt;/div&gt;&lt;div&gt;+toString()::String&lt;/div&gt;&lt;div&gt;+equals(obj: Object)::boolean&lt;/div&gt;&lt;div&gt;+hashCode()::int&lt;/div&gt;&lt;div&gt;+main(args: String[])::void&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="UV5UOb9wK4g15yfljiYe-28">
          <mxGeometry y="188" width="400" height="272" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-32" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Enumeration&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;GameData&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+NAME(&quot;objectname&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ID(&quot;objectid&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+RATING(&quot;average&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+DIFFICULTY(&quot;avgweight&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+RANK(&quot;rank&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+MIN_PLAYERS(&quot;minplayers&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+MAX_PLAYERS(&quot;maxplayers&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+MIN_TIME(&quot;minplaytume&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+MAX_TIME(&quot;maxplaytime&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+YEAR(&quot;yearpublished&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-columnName: String&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+getColumnName()::String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+fromColumnName(columnName: String)::GameData&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+fromString(name: String)::GameData&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="490" y="-310" width="210" height="280" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-34" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Enumeration&amp;gt;&amp;gt;&lt;/i&gt;&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;ConsoleText&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-WELCOME&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-HELP&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-GOODBYE&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-PROMPT&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-NO_FILTER&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-NO_GAMES_LIST&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-FILTERED_CLEAR&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-LIST_HELP&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-FILTER_HELP&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-INVALID_LIST&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-EASTER_EGG&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_EASTER_EGG&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_EXIT&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_HELP&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_QUESTION&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_FILTER&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_LIST&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_SHOW&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_ADD&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_REMOVE&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_CLEAR&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_SAVE&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_OPTION_ALL&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-CMD_SORT_OPTION&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;CMD_SORT_OPTION_DIRECTION_ASC&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;CMD_AORT_OPTION_DIRECTION_DESC&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+toString()::String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+fromString(str:String)::ConsoleText&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="220" y="-340" width="250" height="480" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-33" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Enumeration&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;Operations&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;-operator: String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+EQUALS(&quot;==&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+NOT_EQUALS(&quot;!=&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+GREATER_THAN(&quot;&amp;gt;&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+LESS_THAN(&quot;&amp;lt;&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+GREATER_THAN_EQUALS(&quot;&amp;gt;=&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+LESS_THAN_EQUALS(&quot;&amp;lt;=&quot;)&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+CONTAINS(&quot;~=&quot;)&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+getOperator()::String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+fromOperator(operator:String)::Operations&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+getOperatorFromStr(str:String)::Operations&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="740" y="-320" width="160" height="240" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-41" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-23" target="UV5UOb9wK4g15yfljiYe-2">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="60" y="-820" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-42" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.595;entryDx=0;entryDy=0;entryPerimeter=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-23" target="UV5UOb9wK4g15yfljiYe-14">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-43" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0;entryY=0.118;entryDx=0;entryDy=0;entryPerimeter=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-21" target="UV5UOb9wK4g15yfljiYe-27">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="240" y="-370" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-44" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0;entryY=0.543;entryDx=0;entryDy=0;entryPerimeter=0;endArrow=diamondThin;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-10" target="UV5UOb9wK4g15yfljiYe-19">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="305" y="-672" />
              <mxPoint x="305" y="-496" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-45" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1.025;entryY=0.543;entryDx=0;entryDy=0;entryPerimeter=0;endArrow=diamondThin;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-15" target="UV5UOb9wK4g15yfljiYe-19">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-47" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="480" y="184" as="targetPoint" />
            <mxPoint x="490" y="-390" as="sourcePoint" />
            <Array as="points">
              <mxPoint x="480" y="-390" />
              <mxPoint x="480" y="184" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-48" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-19" target="UV5UOb9wK4g15yfljiYe-32">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-50" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.453;entryY=1.029;entryDx=0;entryDy=0;entryPerimeter=0;dashed=1;endArrow=block;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-11" target="UV5UOb9wK4g15yfljiYe-15">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-51" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-27" target="UV5UOb9wK4g15yfljiYe-29">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="180" y="320" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-52" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.648;entryY=-0.014;entryDx=0;entryDy=0;entryPerimeter=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-24" target="UV5UOb9wK4g15yfljiYe-32">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="200" y="-175" />
              <mxPoint x="200" y="-350" />
              <mxPoint x="626" y="-350" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-53" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.75;entryY=0;entryDx=0;entryDy=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-14" target="UV5UOb9wK4g15yfljiYe-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-54" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-14" target="UV5UOb9wK4g15yfljiYe-32">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="570" y="-443" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="UV5UOb9wK4g15yfljiYe-55" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.25;entryDx=0;entryDy=0;dashed=1;endArrow=open;endFill=0;" edge="1" parent="1" source="UV5UOb9wK4g15yfljiYe-14" target="UV5UOb9wK4g15yfljiYe-28">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="730" as="targetPoint" />
            <Array as="points">
              <mxPoint x="720" y="295" />
            </Array>
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>

*******


### Provided Code

Provide a class diagram for the provided code as you read through it.  For the classes you are adding, you will create them as a separate diagram, so for now, you can just point towards the interfaces for the provided code diagram.



### Your Plans/Design

Create a class diagram for the classes you plan to create. This is your initial design, and it is okay if it changes. Your starting points are the interfaces. 





## (INITIAL DESIGN): Tests to Write - Brainstorm

Write a test (in english) that you can picture for the class diagram you have created. This is the brainstorming stage in the TDD process. 

> [!TIP]
> As a reminder, this is the TDD process we are following:
> 1. Figure out a number of tests by brainstorming (this step)
> 2. Write **one** test
> 3. Write **just enough** code to make that test pass
> 4. Refactor/update  as you go along
> 5. Repeat steps 2-4 until you have all the tests passing/fully built program

You should feel free to number your brainstorm. 

1. Test 1..
2. Test 2..




## (FINAL DESIGN): Class Diagram

Go through your completed code, and update your class diagram to reflect the final design. Make sure you check the file in the browser on github.com to make sure it is rendering correctly. It is normal that the two diagrams don't match! Rarely (though possible) is your initial design perfect. 

For the final design, you just need to do a single diagram that includes both the original classes and the classes you added. 

> [!WARNING]
> If you resubmit your assignment for manual grading, this is a section that often needs updating. You should double check with every resubmit to make sure it is up to date.





## (FINAL DESIGN): Reflection/Retrospective

> [!IMPORTANT]
> The value of reflective writing has been highly researched and documented within computer science, from learning to information to showing higher salaries in the workplace. For this next part, we encourage you to take time, and truly focus on your retrospective.

Take time to reflect on how your design has changed. Write in *prose* (i.e. do not bullet point your answers - it matters in how our brain processes the information). Make sure to include what were some major changes, and why you made them. What did you learn from this process? What would you do differently next time? What was the most challenging part of this process? For most students, it will be a paragraph or two. 
